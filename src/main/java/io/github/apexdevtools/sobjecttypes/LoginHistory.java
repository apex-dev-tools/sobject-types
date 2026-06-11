/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LoginHistory extends SObject {
	public static SObjectType$<LoginHistory> SObjectType;
	public static SObjectFields$<LoginHistory> Fields;

	public String ApiType;
	public String ApiVersion;
	public String Application;
	public String AuthMethodReference;
	public Id AuthenticationServiceId;
	public SObject AuthenticationService;
	public String Browser;
	public String CipherSuite;
	public String ClientVersion;
	public String CountryIso;
	public String ForwardedForIp;
	public Id Id;
	public Id LoginGeoId;
	public LoginGeo LoginGeo;
	public String LoginSubType;
	public Datetime LoginTime;
	public String LoginType;
	public String LoginUrl;
	public Id NetworkId;
	public Network Network;
	public Boolean OptionsIsGet;
	public Boolean OptionsIsPost;
	public String Platform;
	public String SourceIp;
	public String Status;
	public String TlsProtocol;
	public Id UserId;
	public User User;

	public LoginHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoginHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoginHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoginHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoginHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
