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
public class IdpEventLog extends SObject {
	public static SObjectType$<IdpEventLog> SObjectType;
	public static SObjectFields$<IdpEventLog> Fields;

	public Id AppId;
	public ConnectedApplication App;
	public Id AuthSessionId;
	public AuthSession AuthSession;
	public String ErrorCode;
	public Id Id;
	public String IdentityUsed;
	public String InitiatedBy;
	public Boolean OptionsHasLogoutUrl;
	public String SamlEntityUrl;
	public String SsoType;
	public Datetime Timestamp;
	public Id UserId;
	public User User;

	public IdpEventLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public IdpEventLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IdpEventLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IdpEventLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IdpEventLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
