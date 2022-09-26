/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class DashboardComponent extends SObject {
	public static SObjectType$<DashboardComponent> SObjectType;
	public static SObjectFields$<DashboardComponent> Fields;

	public Id CustomReportId;
	public Report CustomReport;
	public Id DashboardId;
	public Dashboard Dashboard;
	public Id Id;
	public String Name;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DashboardComponentFeed[] Feeds;
	public NetworkActivityAudit[] ParentEntities;

	public DashboardComponent clone$() {throw new UnsupportedOperationException();}
	public DashboardComponent clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public DashboardComponent clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public DashboardComponent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public DashboardComponent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
