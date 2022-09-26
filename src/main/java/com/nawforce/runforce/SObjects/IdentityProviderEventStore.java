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
