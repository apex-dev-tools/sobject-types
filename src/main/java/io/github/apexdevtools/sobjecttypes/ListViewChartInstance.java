/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ListViewChartInstance extends SObject {
	public static SObjectType$<ListViewChartInstance> SObjectType;
	public static SObjectFields$<ListViewChartInstance> Fields;

	public String AggregateField;
	public String AggregateType;
	public String ChartType;
	public String DataQuery;
	public String DataQueryWithoutUserFilters;
	public String DeveloperName;
	public String ExternalId;
	public String GroupingField;
	public Id Id;
	public Boolean IsDeletable;
	public Boolean IsEditable;
	public Boolean IsLastViewed;
	public String Label;
	public Id ListViewChartId;
	public ListViewChart ListViewChart;
	public Id ListViewContextId;
	public ListView ListViewContext;
	public String SourceEntity;

	public ListViewChartInstance clone$() {throw new java.lang.UnsupportedOperationException();}
	public ListViewChartInstance clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ListViewChartInstance clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ListViewChartInstance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ListViewChartInstance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
