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
public class AnalyticsDashboardViewDef extends SObject {
	public static SObjectType$<AnalyticsDashboardViewDef> SObjectType;
	public static SObjectFields$<AnalyticsDashboardViewDef> Fields;

	public Id AnalyticsDashboardId;
	public AnalyticsDashboard AnalyticsDashboard;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefaultPage;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id OwnerId;
	public User Owner;
	public Datetime SystemModstamp;
	public String Type;
	public Decimal Version;
	public String ViewName;

	public AnalyticsDashboardViewDef clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardViewDef clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardViewDef clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardViewDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsDashboardViewDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
