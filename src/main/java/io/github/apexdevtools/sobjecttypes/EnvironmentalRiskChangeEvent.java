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
public class EnvironmentalRiskChangeEvent extends SObject {
	public static SObjectType$<EnvironmentalRiskChangeEvent> SObjectType;
	public static SObjectFields$<EnvironmentalRiskChangeEvent> Fields;

	public String Aquifer;
	public String BaselineStress;
	public Decimal BusinessQuantifiedRisk;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MajorBasin;
	public String MinorBasin;
	public String Name;
	public String OverallRisk;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String RiskType;
	public String UpdateYear;

	public EnvironmentalRiskChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EnvironmentalRiskChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EnvironmentalRiskChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EnvironmentalRiskChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EnvironmentalRiskChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
