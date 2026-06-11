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
public class NetworkDataCategory extends SObject {
	public static SObjectType$<NetworkDataCategory> SObjectType;
	public static SObjectFields$<NetworkDataCategory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataCategoryGroupName;
	public String DataCategoryLabel;
	public String DataCategoryName;
	public String Description;
	public Id Id;
	public Id ImageId;
	public ManagedContent Image;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id NetworkId;
	public Network Network;
	public Datetime SystemModstamp;

	public NetworkDataCategory clone$() {throw new java.lang.UnsupportedOperationException();}
	public NetworkDataCategory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NetworkDataCategory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NetworkDataCategory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NetworkDataCategory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
