/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class NetworkFeedResponseMetric extends SObject {
	public static SObjectType$<NetworkFeedResponseMetric> SObjectType;
	public static SObjectFields$<NetworkFeedResponseMetric> Fields;

	public Datetime BestCommentDateTime;
	public Id BestCommentId;
	public FeedComment BestComment;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FeedItemCreatedById;
	public User FeedItemCreatedBy;
	public Datetime FeedItemDateTime;
	public Id FeedItemId;
	public FeedItem FeedItem;
	public Datetime FirstCommentDateTime;
	public Id FirstCommentId;
	public FeedComment FirstComment;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime MarkedAsBestCommentDateTime;
	public String Name;
	public Id NetworkId;
	public Network Network;
	public Id ParentRecordId;
	public SObject ParentRecord;
	public Datetime SystemModstamp;

	public NetworkFeedResponseMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public NetworkFeedResponseMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NetworkFeedResponseMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NetworkFeedResponseMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NetworkFeedResponseMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
