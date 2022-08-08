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
public class ContentWorkspace extends SObject {
	public static SObjectType$<ContentWorkspace> SObjectType;
	public static SObjectFields$<ContentWorkspace> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DefaultRecordTypeId;
	public RecordType DefaultRecordType;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DeveloperName;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsRestrictContentTypes;
	public com.nawforce.runforce.System.Boolean IsRestrictLinkedContentTypes;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastWorkspaceActivityDate;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String NamespacePrefix;
	public Id RootContentFolderId;
	public ContentFolder RootContentFolder;
	public com.nawforce.runforce.System.Boolean ShouldAddCreatorMembership;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String TagModel;
	public Id WorkspaceImageId;
	public ContentAsset WorkspaceImage;
	public com.nawforce.runforce.System.String WorkspaceType;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContentFolderLink[] ContentFolderLinks;
	public ContentWorkspaceMember[] ContentWorkspaceMembers;

	public ContentWorkspace clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspace clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspace clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspace clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspace clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
