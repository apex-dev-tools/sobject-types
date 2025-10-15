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
public class ActivationTrgtIntOrgAccessShare extends SObject {
	public static SObjectType$<ActivationTrgtIntOrgAccessShare> SObjectType;
	public static SObjectFields$<ActivationTrgtIntOrgAccessShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public ActivationTrgtIntOrgAccess Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public ActivationTrgtIntOrgAccessShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActivationTrgtIntOrgAccessShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActivationTrgtIntOrgAccessShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActivationTrgtIntOrgAccessShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActivationTrgtIntOrgAccessShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
