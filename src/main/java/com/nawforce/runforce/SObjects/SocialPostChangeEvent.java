/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SocialPostChangeEvent extends SObject {
	public static SObjectType$<SocialPostChangeEvent> SObjectType;
	public static SObjectFields$<SocialPostChangeEvent> Fields;

	public Decimal AnalyzerScore;
	public String AssignedTo;
	public String AttachmentType;
	public String AttachmentUrl;
	public Object ChangeEventHeader;
	public String Classification;
	public Integer CommentCount;
	public String Content;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DeletedById;
	public User DeletedBy;
	public String EngagementLevel;
	public String ExternalPostId;
	public String Handle;
	public Datetime HarvestDate;
	public String Headline;
	public Id HiddenById;
	public User HiddenBy;
	public Id Id;
	public Integer InboundLinkCount;
	public Boolean IsOutbound;
	public String KeywordGroupName;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LikedBy;
	public Integer LikesAndVotes;
	public String MediaProvider;
	public String MediaType;
	public String MessageType;
	public String Name;
	public String Notes;
	public Id OutboundSocialAccountId;
	public ExternalSocialAccount OutboundSocialAccount;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public Case Parent;
	public Id PersonaId;
	public SocialPersona Persona;
	public String PostPriority;
	public String PostTags;
	public String PostUrl;
	public Datetime Posted;
	public String Provider;
	public String R6PostId;
	public String R6SourceId;
	public String R6TopicId;
	public String Recipient;
	public String RecipientType;
	public String ReplayId;
	public Id ReplyToId;
	public SocialPost ReplyTo;
	public String ResponseContextExternalId;
	public Decimal ReviewScale;
	public Decimal ReviewScore;
	public String ReviewedStatus;
	public String Sentiment;
	public Integer Shares;
	public String SourceTags;
	public String SpamRating;
	public String Status;
	public String StatusMessage;
	public Integer ThreadSize;
	public String TopicProfileName;
	public String TopicType;
	public Integer UniqueCommentors;
	public Integer ViewCount;
	public Id WhoId;
	public SObject Who;

	public SocialPostChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SocialPostChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SocialPostChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SocialPostChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SocialPostChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
