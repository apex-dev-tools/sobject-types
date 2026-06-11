/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AuthenticatorDisputedEvent extends SObject {
	public static SObjectType$<AuthenticatorDisputedEvent> SObjectType;
	public static SObjectFields$<AuthenticatorDisputedEvent> Fields;

	public Id AuthSessionId;
	public AuthSession AuthSession;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventUuid;
	public String LoginKey;
	public String ReplayId;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public Id UserId;
	public User User;
	public String Username;

	public AuthenticatorDisputedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthenticatorDisputedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthenticatorDisputedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthenticatorDisputedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthenticatorDisputedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
