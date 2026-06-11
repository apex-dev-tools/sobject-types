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
public class OthrLifecyclEmssnFctrSetShare extends SObject {
	public static SObjectType$<OthrLifecyclEmssnFctrSetShare> SObjectType;
	public static SObjectFields$<OthrLifecyclEmssnFctrSetShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public OthrLifecyclEmssnFctrSet Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public OthrLifecyclEmssnFctrSetShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public OthrLifecyclEmssnFctrSetShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OthrLifecyclEmssnFctrSetShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OthrLifecyclEmssnFctrSetShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OthrLifecyclEmssnFctrSetShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
