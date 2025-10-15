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
public class AnalyticsDashboardViewSpec extends SObject {
	public static SObjectType$<AnalyticsDashboardViewSpec> SObjectType;
	public static SObjectFields$<AnalyticsDashboardViewSpec> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DashboardViewId;
	public AnalyticsDashboardViewDef DashboardView;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id SourceId;
	public AnalyticsDashboardWidget Source;
	public String SourceName;
	public Datetime SystemModstamp;
	public String Type;

	public AnalyticsDashboardViewSpec clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardViewSpec clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardViewSpec clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardViewSpec clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardViewSpec clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
