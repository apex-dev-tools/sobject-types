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
public class AnalyticsContainerWidgetDef extends SObject {
	public static SObjectType$<AnalyticsContainerWidgetDef> SObjectType;
	public static SObjectFields$<AnalyticsContainerWidgetDef> Fields;

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

	public AnalyticsContainerWidgetDef clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsContainerWidgetDef clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsContainerWidgetDef clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsContainerWidgetDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsContainerWidgetDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
