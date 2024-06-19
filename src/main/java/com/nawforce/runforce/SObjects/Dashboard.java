/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Dashboard extends SObject {
	public static SObjectType$<Dashboard> SObjectType;
	public static SObjectFields$<Dashboard> Fields;

	public String BackgroundDirection;
	public Integer BackgroundEnd;
	public Integer BackgroundStart;
	public String ChartTheme;
	public String ColorPalette;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DashboardResultRefreshedDate;
	public String DashboardResultRunningUser;
	public String Description;
	public String DeveloperName;
	public Id FolderId;
	public SObject Folder;
	public String FolderName;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LeftSize;
	public String MiddleSize;
	public String NamespacePrefix;
	public Id OwnerId;
	public User Owner;
	public String RightSize;
	public Id RunningUserId;
	public User RunningUser;
	public Datetime SystemModstamp;
	public Integer TextColor;
	public String Title;
	public Integer TitleColor;
	public Integer TitleSize;
	public String Type;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DashboardComponent[] DashboardComponents;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DashboardFeed[] Feeds;
	public NetworkActivityAudit[] ParentEntities;
	public GeneratedDocument[] GeneratedDocRefObjects;

	public Dashboard clone$() {throw new java.lang.UnsupportedOperationException();}
	public Dashboard clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Dashboard clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Dashboard clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Dashboard clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
