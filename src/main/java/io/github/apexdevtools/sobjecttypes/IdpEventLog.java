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
