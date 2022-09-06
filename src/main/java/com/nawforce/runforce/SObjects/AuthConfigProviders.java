/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class AuthConfigProviders extends SObject {
	public static SObjectType$<AuthConfigProviders> SObjectType;
	public static SObjectFields$<AuthConfigProviders> Fields;

	public Id AuthConfigId;
	public AuthConfig AuthConfig;
	public Id AuthProviderId;
	public Name AuthProvider;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public AuthConfigProviders clone$() {throw new UnsupportedOperationException();}
	public AuthConfigProviders clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public AuthConfigProviders clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public AuthConfigProviders clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public AuthConfigProviders clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
