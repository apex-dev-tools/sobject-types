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
public class IdentityProviderEventStore extends SObject {
	public static SObjectType$<IdentityProviderEventStore> SObjectType;
	public static SObjectFields$<IdentityProviderEventStore> Fields;

	public Id AppId;
	public ConnectedApplication App;
	public Id AuthSessionId;
	public AuthSession AuthSession;
	public Datetime CreatedDate;
	public String ErrorCode;
	public Datetime EventDate;
	public String EventIdentifier;
	public Boolean HasLogoutUrl;
	public Id Id;
	public String IdentityUsed;
	public String InitiatedBy;
	public Id ProfileId;
	public Profile Profile;
	public Id RoleId;
	public UserRole Role;
	public String SamlEntityUrl;
	public String SsoType;
	public Id UserId;
	public User User;

	public IdentityProviderEventStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public IdentityProviderEventStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IdentityProviderEventStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IdentityProviderEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IdentityProviderEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
