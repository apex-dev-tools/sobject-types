/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Dashboard extends SObject {
	public static SObjectType$<Dashboard> SObjectType;
	public static SObjectFields$<Dashboard> Fields;

	public com.nawforce.runforce.System.String BackgroundDirection;
	public com.nawforce.runforce.System.Integer BackgroundEnd;
	public com.nawforce.runforce.System.Integer BackgroundStart;
	public com.nawforce.runforce.System.String ChartTheme;
	public com.nawforce.runforce.System.String ColorPalette;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String DashboardResultRefreshedDate;
	public com.nawforce.runforce.System.String DashboardResultRunningUser;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DeveloperName;
	public Id FolderId;
	public SObject Folder;
	public com.nawforce.runforce.System.String FolderName;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String LeftSize;
	public com.nawforce.runforce.System.String MiddleSize;
	public com.nawforce.runforce.System.String NamespacePrefix;
	public com.nawforce.runforce.System.String RightSize;
	public Id RunningUserId;
	public User RunningUser;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.Integer TextColor;
	public com.nawforce.runforce.System.String Title;
	public com.nawforce.runforce.System.Integer TitleColor;
	public com.nawforce.runforce.System.Integer TitleSize;
	public com.nawforce.runforce.System.String Type;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DashboardComponent[] DashboardComponents;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DashboardFeed[] Feeds;

	public Dashboard clone$() {throw new java.lang.UnsupportedOperationException();}
	public Dashboard clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Dashboard clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Dashboard clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Dashboard clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
