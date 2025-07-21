/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class StandardInvocableActionType extends SObject {
	public static SObjectType$<StandardInvocableActionType> SObjectType;
	public static SObjectFields$<StandardInvocableActionType> Fields;

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
	public String Namespace;
	public Datetime SystemModstamp;

	public SetupEntityAccess[] SetupEntityAccessItems;

	public StandardInvocableActionType clone$() {throw new java.lang.UnsupportedOperationException();}
	public StandardInvocableActionType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StandardInvocableActionType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StandardInvocableActionType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StandardInvocableActionType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
