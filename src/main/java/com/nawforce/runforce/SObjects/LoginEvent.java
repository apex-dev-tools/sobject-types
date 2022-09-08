/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LoginEvent extends SObject {
	public static SObjectType$<LoginEvent> SObjectType;
	public static SObjectFields$<LoginEvent> Fields;

	public String AdditionalInfo;
	public String ApiType;
	public String ApiVersion;
	public String Application;
	public String AuthMethodReference;
	public Id AuthServiceId;
	public SObject AuthService;
	public String Browser;
	public String CipherSuite;
	public String City;
	public String ClientVersion;
	public String Country;
	public String CountryIso;
	public Datetime CreatedDate;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public String HttpMethod;
	public Id Id;
	public Id LoginGeoId;
	public SObject LoginGeo;
	public Id LoginHistoryId;
	public SObject LoginHistory;
	public String LoginKey;
	public Decimal LoginLatitude;
	public Decimal LoginLongitude;
	public String LoginType;
	public String LoginUrl;
	public Id NetworkId;
	public Network Network;
	public String Platform;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public String PostalCode;
	public String RelatedEventIdentifier;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public String Status;
	public String Subdivision;
	public String TlsProtocol;
	public Id UserId;
	public User User;
	public String UserType;
	public String Username;

	public LoginEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoginEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoginEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoginEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoginEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
