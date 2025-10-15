/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class AnalyticsFilterWidgetDef extends SObject {
	public static SObjectType$<AnalyticsFilterWidgetDef> SObjectType;
	public static SObjectFields$<AnalyticsFilterWidgetDef> Fields;

	public Id AnalyticsDashboardWidgetId;
	public AnalyticsDashboardWidget AnalyticsDashboardWidget;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public AnalyticsFilterWidgetDef clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsFilterWidgetDef clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsFilterWidgetDef clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsFilterWidgetDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsFilterWidgetDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
