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
public class PermissionSetGroup extends SObject {
	public static SObjectType$<PermissionSetGroup> SObjectType;
	public static SObjectFields$<PermissionSetGroup> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Boolean HasActivationRequired;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String Status;
	public Datetime SystemModstamp;

	public PermissionSetAssignment[] Assignments;
	public PermissionSetGroupComponent[] PermissionSetGroupComponents;
	public SessionPermSetActivation[] SessionActivations;

	public PermissionSetGroup clone$() {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetGroup clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetGroup clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
