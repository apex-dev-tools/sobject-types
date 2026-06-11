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
public class PplnInspListViewCalcClmn extends SObject {
	public static SObjectType$<PplnInspListViewCalcClmn> SObjectType;
	public static SObjectFields$<PplnInspListViewCalcClmn> Fields;

	public String ColumnName;
	public Integer ColumnWidth;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id PipelineInspectionListViewId;
	public PipelineInspectionListView PipelineInspectionListView;
	public Integer SortOrder;
	public Datetime SystemModstamp;

	public PplnInspListViewCalcClmn clone$() {throw new java.lang.UnsupportedOperationException();}
	public PplnInspListViewCalcClmn clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PplnInspListViewCalcClmn clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PplnInspListViewCalcClmn clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PplnInspListViewCalcClmn clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
