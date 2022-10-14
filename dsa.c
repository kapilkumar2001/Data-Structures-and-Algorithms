import com.chilkatsoft.*;

public class ChilkatExample {

  static {
    try {
        System.loadLibrary("chilkat");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load.\n" + e);
      System.exit(1);
    }
  }

  public static void main(String argv[])
  {
    // This example requires the Chilkat API to have been previously unlocked.
    // See Global Unlock Sample for sample code.

    CkDsa dsa = new CkDsa();

    // Call GenKey to generate a new DSA key.
    // The number of bits should be at least 1024 and a multiple
    // of 64.   Typical values are either 1024 or 2048.
    // DSA key generation is compute intensive and may take
    // a short while to complete.
    boolean success = dsa.GenKey(2048);
    if (success != true) {
        System.out.println(dsa.lastErrorText());
        return;
        }

    // Extract the private and public parts to PEM or DER format
    // and save to files...
    String pemStr;
    String xmlStr;

    // First for the public key...
    // The public key never needs to be encrypted.

    // Save the public key in PEM format:
    pemStr = dsa.toPublicPem();
    // This example will not check the return value of SaveText...
    success = dsa.SaveText(pemStr,"dsa_pub.pem");

    // Save the public key in DER format:
    success = dsa.ToPublicDerFile("dsa_pub.der");

    boolean bPublicOnly = true;
    // Save to XML
    xmlStr = dsa.toXml(bPublicOnly);
    success = dsa.SaveText(xmlStr,"dsa_pub.xml");

    // ------------------------------------
    // Now for the private key....
    // ------------------------------------

    // Unencrypted PEM:
    pemStr = dsa.toPem();
    success = dsa.SaveText(pemStr,"dsa_priv.pem");

    // Encrypted PEM:
    pemStr = dsa.toEncryptedPem("myPassword");
    success = dsa.SaveText(pemStr,"dsa_privEncrypted.pem");

    // DER:
    success = dsa.ToDerFile("dsa_priv.der");

    // XML:
    bPublicOnly = false;
    xmlStr = dsa.toXml(bPublicOnly);
    success = dsa.SaveText(xmlStr,"dsa_priv.xml");

    System.out.println("Finished!");
  }
}
import com.chilkatsoft.*;

public class ChilkatExample {

  static {
    try {
        System.loadLibrary("chilkat");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load.\n" + e);
      System.exit(1);
    }
  }

  public static void main(String argv[])
  {
    // This example requires the Chilkat API to have been previously unlocked.
    // See Global Unlock Sample for sample code.

    CkDsa dsa = new CkDsa();

    // Call GenKey to generate a new DSA key.
    // The number of bits should be at least 1024 and a multiple
    // of 64.   Typical values are either 1024 or 2048.
    // DSA key generation is compute intensive and may take
    // a short while to complete.
    boolean success = dsa.GenKey(2048);
    if (success != true) {
        System.out.println(dsa.lastErrorText());
        return;
        }

    // Extract the private and public parts to PEM or DER format
    // and save to files...
    String pemStr;
    String xmlStr;

    // First for the public key...
    // The public key never needs to be encrypted.

    // Save the public key in PEM format:
    pemStr = dsa.toPublicPem();
    // This example will not check the return value of SaveText...
    success = dsa.SaveText(pemStr,"dsa_pub.pem");

    // Save the public key in DER format:
    success = dsa.ToPublicDerFile("dsa_pub.der");

    boolean bPublicOnly = true;
    // Save to XML
    xmlStr = dsa.toXml(bPublicOnly);
    success = dsa.SaveText(xmlStr,"dsa_pub.xml");

    // ------------------------------------
    // Now for the private key....
    // ------------------------------------

    // Unencrypted PEM:
    pemStr = dsa.toPem();
    success = dsa.SaveText(pemStr,"dsa_priv.pem");

    // Encrypted PEM:
    pemStr = dsa.toEncryptedPem("myPassword");
    success = dsa.SaveText(pemStr,"dsa_privEncrypted.pem");

    // DER:
    success = dsa.ToDerFile("dsa_priv.der");

    // XML:
    bPublicOnly = false;
    xmlStr = dsa.toXml(bPublicOnly);
    success = dsa.SaveText(xmlStr,"dsa_priv.xml");

    System.out.println("Finished!");
  }
}
import com.chilkatsoft.*;

public class ChilkatExample {

  static {
    try {
        System.loadLibrary("chilkat");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load.\n" + e);
      System.exit(1);
    }
  }

  public static void main(String argv[])
  {
    // This example requires the Chilkat API to have been previously unlocked.
    // See Global Unlock Sample for sample code.

    CkDsa dsa = new CkDsa();

    // Call GenKey to generate a new DSA key.
    // The number of bits should be at least 1024 and a multiple
    // of 64.   Typical values are either 1024 or 2048.
    // DSA key generation is compute intensive and may take
    // a short while to complete.
    boolean success = dsa.GenKey(2048);
    if (success != true) {
        System.out.println(dsa.lastErrorText());
        return;
        }

    // Extract the private and public parts to PEM or DER format
    // and save to files...
    String pemStr;
    String xmlStr;

    // First for the public key...
    // The public key never needs to be encrypted.

    // Save the public key in PEM format:
    pemStr = dsa.toPublicPem();
    // This example will not check the return value of SaveText...
    success = dsa.SaveText(pemStr,"dsa_pub.pem");

    // Save the public key in DER format:
    success = dsa.ToPublicDerFile("dsa_pub.der");

    boolean bPublicOnly = true;
    // Save to XML
    xmlStr = dsa.toXml(bPublicOnly);
    success = dsa.SaveText(xmlStr,"dsa_pub.xml");

    // ------------------------------------
    // Now for the private key....
    // ------------------------------------

    // Unencrypted PEM:
    pemStr = dsa.toPem();
    success = dsa.SaveText(pemStr,"dsa_priv.pem");

    // Encrypted PEM:
    pemStr = dsa.toEncryptedPem("myPassword");
    success = dsa.SaveText(pemStr,"dsa_privEncrypted.pem");

    // DER:
    success = dsa.ToDerFile("dsa_priv.der");

    // XML:
    bPublicOnly = false;
    xmlStr = dsa.toXml(bPublicOnly);
    success = dsa.SaveText(xmlStr,"dsa_priv.xml");

    System.out.println("Finished!");
  }
}
import com.chilkatsoft.*;

public class ChilkatExample {

  static {
    try {
        System.loadLibrary("chilkat");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load.\n" + e);
      System.exit(1);
    }
  }

  public static void main(String argv[])
  {
    // This example requires the Chilkat API to have been previously unlocked.
    // See Global Unlock Sample for sample code.

    CkDsa dsa = new CkDsa();

    // Call GenKey to generate a new DSA key.
    // The number of bits should be at least 1024 and a multiple
    // of 64.   Typical values are either 1024 or 2048.
    // DSA key generation is compute intensive and may take
    // a short while to complete.
    boolean success = dsa.GenKey(2048);
    if (success != true) {
        System.out.println(dsa.lastErrorText());
        return;
        }

    // Extract the private and public parts to PEM or DER format
    // and save to files...
    String pemStr;
    String xmlStr;

    // First for the public key...
    // The public key never needs to be encrypted.

    // Save the public key in PEM format:
    pemStr = dsa.toPublicPem();
    // This example will not check the return value of SaveText...
    success = dsa.SaveText(pemStr,"dsa_pub.pem");

    // Save the public key in DER format:
    success = dsa.ToPublicDerFile("dsa_pub.der");

    boolean bPublicOnly = true;
    // Save to XML
    xmlStr = dsa.toXml(bPublicOnly);
    success = dsa.SaveText(xmlStr,"dsa_pub.xml");

    // ------------------------------------
    // Now for the private key....
    // ------------------------------------

    // Unencrypted PEM:
    pemStr = dsa.toPem();
    success = dsa.SaveText(pemStr,"dsa_priv.pem");

    // Encrypted PEM:
    pemStr = dsa.toEncryptedPem("myPassword");
    success = dsa.SaveText(pemStr,"dsa_privEncrypted.pem");

    // DER:
    success = dsa.ToDerFile("dsa_priv.der");

    // XML:
    bPublicOnly = false;
    xmlStr = dsa.toXml(bPublicOnly);
    success = dsa.SaveText(xmlStr,"dsa_priv.xml");

    System.out.println("Finished!");
  }
}
import com.chilkatsoft.*;

public class ChilkatExample {

  static {
    try {
        System.loadLibrary("chilkat");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load.\n" + e);
      System.exit(1);
    }
  }

  public static void main(String argv[])
  {
    // This example requires the Chilkat API to have been previously unlocked.
    // See Global Unlock Sample for sample code.

    CkDsa dsa = new CkDsa();

    // Call GenKey to generate a new DSA key.
    // The number of bits should be at least 1024 and a multiple
    // of 64.   Typical values are either 1024 or 2048.
    // DSA key generation is compute intensive and may take
    // a short while to complete.
    boolean success = dsa.GenKey(2048);
    if (success != true) {
        System.out.println(dsa.lastErrorText());
        return;
        }

    // Extract the private and public parts to PEM or DER format
    // and save to files...
    String pemStr;
    String xmlStr;

    // First for the public key...
    // The public key never needs to be encrypted.

    // Save the public key in PEM format:
    pemStr = dsa.toPublicPem();
    // This example will not check the return value of SaveText...
    success = dsa.SaveText(pemStr,"dsa_pub.pem");

    // Save the public key in DER format:
    success = dsa.ToPublicDerFile("dsa_pub.der");

    boolean bPublicOnly = true;
    // Save to XML
    xmlStr = dsa.toXml(bPublicOnly);
    success = dsa.SaveText(xmlStr,"dsa_pub.xml");

    // ------------------------------------
    // Now for the private key....
    // ------------------------------------

    // Unencrypted PEM:
    pemStr = dsa.toPem();
    success = dsa.SaveText(pemStr,"dsa_priv.pem");

    // Encrypted PEM:
    pemStr = dsa.toEncryptedPem("myPassword");
    success = dsa.SaveText(pemStr,"dsa_privEncrypted.pem");

    // DER:
    success = dsa.ToDerFile("dsa_priv.der");

    // XML:
    bPublicOnly = false;
    xmlStr = dsa.toXml(bPublicOnly);
    success = dsa.SaveText(xmlStr,"dsa_priv.xml");

    System.out.println("Finished!");
  }
}
