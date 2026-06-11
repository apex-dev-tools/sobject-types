/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class OmniDataMapperView extends SObject {
	public static SObjectType$<OmniDataMapperView> SObjectType;
	public static SObjectFields$<OmniDataMapperView> Fields;

	public String CurrencyIsoCode;
	public String DataMapperName;
	public String Description;
	public String ExternalId;
	public Id Id;
	public String InputType;
	public Boolean IsActive;
	public Boolean IsFileBased;
	public Boolean IsManagedUsingStdDesigner;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OmniDataTransformId;
	public OmniDataTransform OmniDataTransform;
	public String OutputType;
	public String Type;
	public Integer VersionCount;
	public Decimal VersionNumber;

	public OmniDataMapperView clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniDataMapperView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniDataMapperView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniDataMapperView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniDataMapperView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
