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
public class AttribModelOutput extends SObject {
	public static SObjectType$<AttribModelOutput> SObjectType;
	public static SObjectFields$<AttribModelOutput> Fields;

	public Id AttribModelId;
	public AttribModel AttribModel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String OutputDataLakeObjectApiName;
	public Datetime SystemModstamp;

	public AttribModelOutputKeyField[] AttribModelOutputKeyFields;

	public AttribModelOutput clone$() {throw new java.lang.UnsupportedOperationException();}
	public AttribModelOutput clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelOutput clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelOutput clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelOutput clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
