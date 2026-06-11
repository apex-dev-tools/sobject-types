/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DataStatistics extends SObject {
	public static SObjectType$<DataStatistics> SObjectType;
	public static SObjectFields$<DataStatistics> Fields;

	public String ExternalId;
	public Id Id;
	public String StatType;
	public Integer StatValue;
	public String Type;
	public Id UserId;
	public User User;

	public DataStatistics clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataStatistics clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataStatistics clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataStatistics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataStatistics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
