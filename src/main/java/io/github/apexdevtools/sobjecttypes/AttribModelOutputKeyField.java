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
public class AttribModelOutputKeyField extends SObject {
	public static SObjectType$<AttribModelOutputKeyField> SObjectType;
	public static SObjectFields$<AttribModelOutputKeyField> Fields;

	public Id AttribModelOutputId;
	public AttribModelOutput AttribModelOutput;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefaultValue;
	public String FieldType;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsNullable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer Sequence;
	public Datetime SystemModstamp;

	public AttribModelOutputKeyField clone$() {throw new java.lang.UnsupportedOperationException();}
	public AttribModelOutputKeyField clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelOutputKeyField clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelOutputKeyField clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelOutputKeyField clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
