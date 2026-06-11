/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

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

	public DashboardComponent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DashboardComponent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DashboardComponent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DashboardComponent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DashboardComponent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
