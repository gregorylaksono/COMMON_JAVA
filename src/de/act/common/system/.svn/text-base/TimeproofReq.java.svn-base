package de.act.common.system;

//file-encoding: UTF-8

/**
* This is a sample program to showcase a timestamp-request 
* from a TSS-400-unit(a.k.a. TSA), using the HTTP-protocol.
* 
* The code is based on the Timestamper-Class API provided by SUN.
* Please consult the SUN-API-Documentation here :
* 
* http://srcrr.com/java/oracle/openjdk/6/reference/sun/security/timestamp/package-summary.html
*  or
* http://www.docjar.com/docs/api/sun/security/timestamp/package-index.html
* 
* Information about the used Object-Identifiers can be found in this public database : 
* http://oid-info.com/
*
* @author Andreas Schoeller / Timeproof GmbH
* 
* tested with 'java version "1.7.0_10-ea"'
*/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;

import org.apache.log4j.Logger;

import sun.security.pkcs.PKCS7;
import sun.security.timestamp.HttpTimestamper;
import sun.security.timestamp.TSRequest;
import sun.security.timestamp.TSResponse;
import sun.security.util.DerOutputStream;
import sun.security.util.DerValue;
import sun.security.util.ObjectIdentifier;
import de.act.common.types.formulars.IFormularMain;

public class TimeproofReq extends TSRequest {

private ObjectIdentifier hashAlgorithmId = null;
private byte[] hashValue;
private BigInteger nonce = null;
private boolean returnCertificate = false;
private static final Logger log = Logger.getLogger(TimeproofReq.class);

// Timeproof-Policy for the TSS-400-unit
private final ObjectIdentifier policyId = new ObjectIdentifier("1.3.6.1.4.1.5472.1.3");

/** 
* generates a TimeStamp-Request using the parameters provided.
*
* @param byte[]     hashValue       your documents hash-value
* @param String     hashAlgorithm   name ('SHA-1' or 'SHA-256')
* 
* @return sun.security.timestamp.TSRequest
*/

public TimeproofReq(
  byte[] hashValue, 
  String hashAlgorithm ) throws IOException
{
   super( hashValue, hashAlgorithm );
   
   if ("SHA-1".equalsIgnoreCase(hashAlgorithm) ||
       "SHA".equalsIgnoreCase(hashAlgorithm) ||
       "SHA1".equalsIgnoreCase(hashAlgorithm)) {
       hashAlgorithmId = new ObjectIdentifier("1.3.14.3.2.26");
       assert hashValue.length == 20;
   } else if("SHA-256".equalsIgnoreCase(hashAlgorithm)) {
       hashAlgorithmId = new ObjectIdentifier("2.16.840.1.101.3.4.2.1");
       assert hashValue.length == 32;
   } else {
       throw new IOException( "Unsupported Hash-Algorithm : '"+hashAlgorithm+"'" );
   }

   this.hashValue = new byte[hashValue.length];
   System.arraycopy(hashValue, 0, this.hashValue, 0, hashValue.length);
}

public byte[] encode() throws IOException {
   DerOutputStream request = new DerOutputStream();
   
   // version
   request.putInteger(1);
   
   // messageImprint
   DerOutputStream msgImprint = new DerOutputStream();
   DerOutputStream hashAlgorithm = new DerOutputStream();
   hashAlgorithm.putOID( hashAlgorithmId );
   msgImprint.write( DerValue.tag_Sequence, hashAlgorithm );
   msgImprint.putOctetString( hashValue );
   request.write( DerValue.tag_Sequence, msgImprint );
   
   // Timeproof-policy
   request.putOID( policyId );
   
   // optional elements
   if (nonce != null)
       request.putInteger(nonce);
   
   if (returnCertificate)
       request.putBoolean(false);
   
   DerOutputStream out = new DerOutputStream();
   out.write( DerValue.tag_Sequence, request);
   
   return out.toByteArray();
}

public void setNonce( BigInteger nonce) { this.nonce = nonce; }

public void requestCertificate( boolean returnCertificate ) { 
  this.returnCertificate = returnCertificate; 
}

//public static void main( String[] args ) throws IOException{
public PKCS7 getObject(IFormularMain formularMain) throws IOException{
  
	 Serializable mySerializableObj = formularMain;

	  ByteArrayOutputStream baos = new ByteArrayOutputStream();

	  ObjectOutputStream oos = new ObjectOutputStream(baos);

	  oos.writeObject(mySerializableObj);

	  byte[] doc = baos.toByteArray();
	  
     // This is your document, contract, bill, receipt or 
     // whatever binary data you have.
     // you may read it from a file or a url as byte[]
//     byte[] doc = "your document".getBytes();

     // The current test-setup-box at 'http://80.81.249.152:318'
     // supports 'SHA1' and 'SHA-256'
     String hashAlgo = "SHA-256"; // so either use "SHA1" or "SHA-256"
     MessageDigest md = null;
     try{
        md = MessageDigest.getInstance( hashAlgo );
     }catch( Exception ex){
        System.out.println( "Exception:\n"+ex );
     }
  
     // Creates the hash-value of your 
     // document into 'hash'.
     md.update( doc );
     byte[] hash = md.digest();
  
//     System.out.print("Your documents "+hashAlgo+"-value ("+hash.length+"-Byte) is :\n[ " );
     for ( int i=0; i<hash.length; i++) {
        System.out.print( hash[i] );
        System.out.print( " " );
     }
//     System.out.println("]");
  
     // The Request-Class takes the
     // hash-value and the DigestAlgorithm as input.
     TSRequest req = null;
     try{
        req = new TimeproofReq( hash, hashAlgo );
     }catch( Exception ex ){
        System.out.println("Exception:\n"+ex );
     }

     // To identify your request, you can use a nonce.
     // The TSA will echo the given value in the response.
     // Use it when you do many requests in parallel.
     BigInteger nonce = BigInteger.valueOf( System.currentTimeMillis() );
     req.setNonce( nonce );


     // If you set this to 'true' you will find
     // the TSA's signing-certificate in the response.
     // Otherwise you find a reference to the certificate
     // in the SignersInformation.
     // A response with cert 'weights' ~2 Kb.
     // Without the cert it should be less than 1 Kb.
     req.requestCertificate( false );
     
     // http://zeitstempel.dfn.de
     HttpTimestamper TSA = new HttpTimestamper( "http://80.81.249.152:318"  );

     // post the HTTP-Request
     TSResponse resp = null;
     try{
        resp = TSA.generateTimestamp( req );
     }catch( Exception ex){
        System.out.println("Exception:\n"+ex );
     }
  
//     System.out.println("CMS-Response-size = "+resp.getEncodedToken().length+"-Bytes");

     // now look at the returned statusCode :
     // expect = 0
     int status = resp.getStatusCode();

//     System.out.print( "TSA-Status = "+ status );

     if ( status > 0 ){   
         System.out.println( "FailureCode :"+resp.getFailureCode() );
         System.out.println( resp.getFailureCodeAsText() );
         System.out.println( "Smth. went wrong :" );
     }   

//     System.out.println(" = '"+resp.getStatusCodeAsText()+"'");

     // Get your PKCS7-Token from the TSResponse
     // Keep this token, store it to file, db etc.
     // The token contains all the evidence.
     // The TSA keps a copy of any sucessfully delivered TSResponse.
     
     PKCS7 cmsToken = resp.getToken();
     log.info("cmsToken adalah >>>>>>>>>> " + cmsToken);
         
//     System.out.println ( cmsToken.toString() );
     
  return cmsToken;
}
}