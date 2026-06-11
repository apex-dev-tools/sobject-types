/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class FeedRevision extends SObject {
	public static SObjectType$<FeedRevision> SObjectType;
	public static SObjectFields$<FeedRevision> Fields;

	public String Action;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EditedAttribute;
	public Id FeedEntityId;
	public SObject FeedEntity;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsValueRichText;
	public Id OriginNetworkId;
	public Network OriginNetwork;
	public Integer Revision;
	public Datetime SystemModstamp;
	public String Value;

	public FeedRevision clone$() {throw new java.lang.UnsupportedOperationException();}
	public FeedRevision clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FeedRevision clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FeedRevision clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FeedRevision clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
