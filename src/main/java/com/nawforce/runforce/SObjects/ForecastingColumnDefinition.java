/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ForecastingColumnDefinition extends SObject {
	public static SObjectType$<ForecastingColumnDefinition> SObjectType;
	public static SObjectFields$<ForecastingColumnDefinition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id ForecastingTypeId;
	public ForecastingType ForecastingType;
	public String Formula;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String ResultField;
	public Datetime SystemModstamp;

	public ForecastingColumnDefinitionLocalization[] Localization;

	public ForecastingColumnDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingColumnDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingColumnDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingColumnDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingColumnDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
