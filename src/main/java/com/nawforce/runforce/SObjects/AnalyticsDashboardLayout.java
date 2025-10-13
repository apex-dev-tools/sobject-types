/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AnalyticsDashboardLayout extends SObject {
	public static SObjectType$<AnalyticsDashboardLayout> SObjectType;
	public static SObjectFields$<AnalyticsDashboardLayout> Fields;

	public Id AnalyticsDashboardId;
	public AnalyticsDashboard AnalyticsDashboard;
	public String ColumnCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LayoutName;
	public String MaxWidth;
	public String RowHeight;
	public Datetime SystemModstamp;
	public Decimal Version;

	public AnalyticsDashboardLayout clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardLayout clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardLayout clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardLayout clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardLayout clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
