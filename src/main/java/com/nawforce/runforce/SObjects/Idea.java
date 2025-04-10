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
public class Idea extends SObject {
	public static SObjectType$<Idea> SObjectType;
	public static SObjectFields$<Idea> Fields;

	public Blob AttachmentBody;
	public String AttachmentContentType;
	public Integer AttachmentLength;
	public String AttachmentName;
	public String Body;
	public String Categories;
	public Id CommunityId;
	public Community Community;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CreatorFullPhotoUrl;
	public String CreatorName;
	public String CreatorSmallPhotoUrl;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsHtml;
	public Boolean IsMerged;
	public Datetime LastCommentDate;
	public Id LastCommentId;
	public IdeaComment LastComment;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer NumComments;
	public Id ParentIdeaId;
	public Idea ParentIdea;
	public Id RecordTypeId;
	public RecordType RecordType;
	public String Status;
	public Datetime SystemModstamp;
	public String Title;
	public Decimal VoteScore;
	public Decimal VoteTotal;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public IdeaComment[] Comments;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public Vote[] Votes;

	public Idea clone$() {throw new java.lang.UnsupportedOperationException();}
	public Idea clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Idea clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Idea clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Idea clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
