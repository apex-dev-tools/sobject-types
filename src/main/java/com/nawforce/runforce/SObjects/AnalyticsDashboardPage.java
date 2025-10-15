/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AnalyticsDashboardPage extends SObject {
	public static SObjectType$<AnalyticsDashboardPage> SObjectType;
	public static SObjectFields$<AnalyticsDashboardPage> Fields;

	public Id AnalyticsDashboardLayoutId;
	public AnalyticsDashboardLayout AnalyticsDashboardLayout;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Integer Index;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String PageName;
	public Datetime SystemModstamp;

	public AnalyticsDashboardPage clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardPage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardPage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardPage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardPage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
