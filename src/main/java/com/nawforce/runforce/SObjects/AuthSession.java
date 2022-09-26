/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AuthSession extends SObject {
	public static SObjectType$<AuthSession> SObjectType;
	public static SObjectFields$<AuthSession> Fields;

	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsCurrent;
	public Datetime LastModifiedDate;
	public Id LoginGeoId;
	public LoginGeo LoginGeo;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public String LoginType;
	public String LogoutUrl;
	public Integer NumSecondsValid;
	public Id ParentId;
	public AuthSession Parent;
	public String SessionSecurityLevel;
	public String SessionType;
	public String SourceIp;
	public String UserType;
	public Id UsersId;
	public User Users;

	public SessionPermSetActivation[] SessionPermSetActivations;

	public AuthSession clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthSession clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthSession clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
