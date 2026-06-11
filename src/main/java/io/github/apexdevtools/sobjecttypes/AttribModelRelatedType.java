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
public class AttribModelRelatedType extends SObject {
	public static SObjectType$<AttribModelRelatedType> SObjectType;
	public static SObjectFields$<AttribModelRelatedType> Fields;

	public Id AttribModelId;
	public AttribModel AttribModel;
	public String AttributionModelType;
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
	public Datetime SystemModstamp;

	public AttribModelRelatedTypeParm[] AttribModelRelatedTypeParameters;

	public AttribModelRelatedType clone$() {throw new java.lang.UnsupportedOperationException();}
	public AttribModelRelatedType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelRelatedType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelRelatedType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelRelatedType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
