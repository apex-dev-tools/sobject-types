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
public class DigitalPassTmplParameterChangeEvent extends SObject {
	public static SObjectType$<DigitalPassTmplParameterChangeEvent> SObjectType;
	public static SObjectFields$<DigitalPassTmplParameterChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataType;
	public String DefaultValue;
	public Id DigitalPassTemplateId;
	public DigitalPassTemplate DigitalPassTemplate;
	public Id Id;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;

	public DigitalPassTmplParameterChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassTmplParameterChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassTmplParameterChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassTmplParameterChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassTmplParameterChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
