/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PipelineInspectionListView extends SObject {
	public static SObjectType$<PipelineInspectionListView> SObjectType;
	public static SObjectFields$<PipelineInspectionListView> Fields;

	public String ChangePeriodLiteralType;
	public Date ChangePeriodStartDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DateLiteralType;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsSystemManaged;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ListViewId;
	public ListView ListView;
	public String MarketSegments;
	public Date StartDate;
	public String SummaryField;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;
	public String ViewType;

	public PipelineInspectionListView clone$() {throw new java.lang.UnsupportedOperationException();}
	public PipelineInspectionListView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PipelineInspectionListView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PipelineInspectionListView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PipelineInspectionListView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
