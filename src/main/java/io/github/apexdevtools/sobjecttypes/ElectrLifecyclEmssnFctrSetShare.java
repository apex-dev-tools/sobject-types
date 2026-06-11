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
public class ElectrLifecyclEmssnFctrSetShare extends SObject {
	public static SObjectType$<ElectrLifecyclEmssnFctrSetShare> SObjectType;
	public static SObjectFields$<ElectrLifecyclEmssnFctrSetShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public ElectrLifecyclEmssnFctrSet Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public ElectrLifecyclEmssnFctrSetShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public ElectrLifecyclEmssnFctrSetShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ElectrLifecyclEmssnFctrSetShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ElectrLifecyclEmssnFctrSetShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ElectrLifecyclEmssnFctrSetShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
