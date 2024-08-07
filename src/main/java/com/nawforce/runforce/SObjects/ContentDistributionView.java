/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class ContentDistributionView extends SObject {
	public static SObjectType$<ContentDistributionView> SObjectType;
	public static SObjectFields$<ContentDistributionView> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DistributionId;
	public ContentDistribution Distribution;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsDownload;
	public Boolean IsInternal;
	public Id ParentViewId;
	public ContentDistributionView ParentView;
	public Datetime SystemModstamp;

	public ContentDistributionView clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentDistributionView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentDistributionView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentDistributionView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentDistributionView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
