package se.dhbw.unittest;

public class MD5Validator {

	public boolean isValidMD5(String md5) {
	    return md5.matches("[a-fA-F0-9]{32}");
	}
}
