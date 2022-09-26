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
public class FeedComment extends SObject {
	public static SObjectType$<FeedComment> SObjectType;
	public static SObjectFields$<FeedComment> Fields;

	public String CommentBody;
	public String CommentType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id FeedItemId;
	public SObject FeedItem;
	public Boolean HasEntityLinks;
	public Id Id;
	public Id InsertedById;
	public User InsertedBy;
	public Boolean IsDeleted;
	public Boolean IsRichText;
	public Boolean IsVerified;
	public Id LastEditById;
	public User LastEditBy;
	public Datetime LastEditDate;
	public Id ParentId;
	public SObject Parent;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public Integer Revision;
	public String Status;
	public Datetime SystemModstamp;
	public Integer ThreadChildrenCount;
	public Datetime ThreadLastUpdatedDate;
	public Integer ThreadLevel;
	public Id ThreadParentId;
	public FeedComment ThreadParent;

	public NetworkActivityAudit[] AuditableEntities;
	public FeedAttachment[] FeedAttachments;
	public FeedRevision[] FeedRevisions;
	public FeedComment[] FeedThreadedComments;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToFeedComment;

	public FeedComment clone$() {throw new java.lang.UnsupportedOperationException();}
	public FeedComment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FeedComment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FeedComment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FeedComment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
