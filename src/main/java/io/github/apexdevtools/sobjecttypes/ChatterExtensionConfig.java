/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ChatterExtensionConfig extends SObject {
	public static SObjectType$<ChatterExtensionConfig> SObjectType;
	public static SObjectFields$<ChatterExtensionConfig> Fields;

	public Boolean CanCreate;
	public Boolean CanRead;
	public Id ChatterExtensionId;
	public ChatterExtension ChatterExtension;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id NetworkId;
	public Network Network;
	public Integer Position;
	public Datetime SystemModstamp;

	public ChatterExtensionConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public ChatterExtensionConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ChatterExtensionConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ChatterExtensionConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ChatterExtensionConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
