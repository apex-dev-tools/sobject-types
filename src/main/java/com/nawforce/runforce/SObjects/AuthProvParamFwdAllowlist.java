/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AuthProvParamFwdAllowlist extends SObject {
	public static SObjectType$<AuthProvParamFwdAllowlist> SObjectType;
	public static SObjectFields$<AuthProvParamFwdAllowlist> Fields;

	public Id AuthProviderId;
	public AuthProvider AuthProvider;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Param;
	public Datetime SystemModstamp;

	public AuthProvParamFwdAllowlist clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthProvParamFwdAllowlist clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthProvParamFwdAllowlist clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthProvParamFwdAllowlist clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthProvParamFwdAllowlist clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
