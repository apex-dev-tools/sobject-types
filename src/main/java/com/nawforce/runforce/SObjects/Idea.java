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
public class Idea extends SObject {
	public static SObjectType$<Idea> SObjectType;
	public static SObjectFields$<Idea> Fields;

	public com.nawforce.runforce.System.String Body;
	public com.nawforce.runforce.System.String Categories;
	public Id CommunityId;
	public Community Community;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CreatorFullPhotoUrl;
	public com.nawforce.runforce.System.String CreatorName;
	public com.nawforce.runforce.System.String CreatorSmallPhotoUrl;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsHtml;
	public com.nawforce.runforce.System.Boolean IsMerged;
	public Datetime LastCommentDate;
	public Id LastCommentId;
	public IdeaComment LastComment;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.Integer NumComments;
	public Id ParentIdeaId;
	public Idea ParentIdea;
	public Id RecordTypeId;
	public RecordType RecordType;
	public com.nawforce.runforce.System.String Status;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Title;
	public Decimal VoteScore;
	public Decimal VoteTotal;

	public IdeaComment[] Comments;
	public Vote[] Votes;

	public Idea clone$() {throw new java.lang.UnsupportedOperationException();}
	public Idea clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Idea clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Idea clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Idea clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
