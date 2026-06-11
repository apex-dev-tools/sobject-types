/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class UnstructuredStorageSpaceShare extends SObject {
	public static SObjectType$<UnstructuredStorageSpaceShare> SObjectType;
	public static SObjectFields$<UnstructuredStorageSpaceShare> Fields;

	public String AccessLevel;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public UnstructuredStorageSpace Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public UnstructuredStorageSpaceShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public UnstructuredStorageSpaceShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UnstructuredStorageSpaceShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UnstructuredStorageSpaceShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UnstructuredStorageSpaceShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
