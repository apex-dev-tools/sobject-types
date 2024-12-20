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
public class PortalDelegablePermissionSet extends SObject {
	public static SObjectType$<PortalDelegablePermissionSet> SObjectType;
	public static SObjectFields$<PortalDelegablePermissionSet> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id PermissionSetId;
	public PermissionSet PermissionSet;
	public Id ProfileId;
	public Profile Profile;
	public Datetime SystemModstamp;

	public PortalDelegablePermissionSet clone$() {throw new java.lang.UnsupportedOperationException();}
	public PortalDelegablePermissionSet clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PortalDelegablePermissionSet clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PortalDelegablePermissionSet clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PortalDelegablePermissionSet clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
