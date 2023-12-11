for ( let i = 0;i <=16 ;i++){
    let nilai ;
    if (i<=7){
        nilai ="telah selesai";
    }
    if (i ===5|| i ===14){
        nilai ="diadakan kuis";
    }else if (i <=13 && i >=9 || i === 15){
        nilai = "belum selesai";
    }else if (i === 8 || i ===16){
        nilai ="diadakan ujian";               
    }
    console.log (`pertemuan ke ${i} ${nilai}`);
}