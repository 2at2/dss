package eu.europa.esig.dss;

public enum ExtendedKeyUsageOids implements OidDescription {

	TIMESTAMPING("timeStamping", "1.3.6.1.5.5.7.3.8"),

	OCSP_SIGNING("ocspSigning", "1.3.6.1.5.5.7.3.9"),

	/**
	 * ETSI TS 119 612
	 * -- OID for TSL signing KeyPurposeID for ExtKeyUsageSyntax
	 * id-tsl OBJECT IDENTIFIER { itu-t(0) identified-organization(4)
	 * etsi(0) tsl-specification (2231) }
	 * id-tsl-kp OBJECT IDENTIFIER ::= { id-tsl kp(3) }
	 * id-tsl-kp-tslSigning OBJECT IDENTIFIER ::= { id-tsl-kp tsl-signing(0) }
	 */
	TSL_SIGNING("tslSigning", "0.4.0.2231.3.0");

	private final String description;
	private final String oid;

	ExtendedKeyUsageOids(String description, String oid) {
		this.description = description;
		this.oid = oid;
	}

	@Override
	public String getOid() {
		return oid;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
