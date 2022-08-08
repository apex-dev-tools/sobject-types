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
public class FeedItem extends SObject {
	public static SObjectType$<FeedItem> SObjectType;
	public static SObjectFields$<FeedItem> Fields;

	public Id BestCommentId;
	public FeedComment BestComment;
	public com.nawforce.runforce.System.String Body;
	public com.nawforce.runforce.System.Integer CommentCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.Boolean HasContent;
	public com.nawforce.runforce.System.Boolean HasFeedEntity;
	public com.nawforce.runforce.System.Boolean HasLink;
	public com.nawforce.runforce.System.Boolean HasVerifiedComment;
	public Id Id;
	public Id InsertedById;
	public User InsertedBy;
	public com.nawforce.runforce.System.Boolean IsClosed;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsRichText;
	public Id LastEditById;
	public User LastEditBy;
	public Datetime LastEditDate;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.Integer LikeCount;
	public com.nawforce.runforce.System.String LinkUrl;
	public Id ParentId;
	public Name Parent;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public com.nawforce.runforce.System.Integer Revision;
	public com.nawforce.runforce.System.String Status;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Title;
	public com.nawforce.runforce.System.String Type;

	public FeedAttachment[] FeedAttachments;
	public FeedComment[] FeedComments;
	public WorkThanks[] FeedItemThanks;
	public FeedLike[] FeedLikes;
	public FeedRevision[] FeedRevisions;
	public FeedSignal[] FeedSignals;
	public FeedTrackedChange[] FeedTrackedChanges;
	public TopicAssignment[] TopicAssignments;

	public FeedItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public FeedItem clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FeedItem clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FeedItem clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FeedItem clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
