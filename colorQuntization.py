import math

#RGBColors[R,G,B]
RGBColors = [[0, 0, 0], [0, 0, 128], [0, 0, 255], [0, 128, 0], [0, 128, 128], [0, 128, 255], [0, 255, 0], [0, 255, 128], [0, 255, 255], [128, 0, 0], [128, 0, 128], [128, 0, 255], [128, 128, 0], [128, 128, 128], [128, 128, 255], [128, 255, 0], [128, 255, 128], [128, 255, 255], [255, 0, 0], [255, 0, 128], [255, 0, 255], [255, 128, 0], [255, 128, 128], [255, 128, 255], [255, 255, 0], [255, 255, 128], [255, 255, 255]]

#Color Dictionary for Dec to Hex (code of Color) [ex)0xFFFFFF]
colorDic = {0: '00', 128: '80', 255: 'FF'}

class Color:
    def __init__(self, r, g, b):
        self.r = r
        self.g = g
        self.b = b
        
    def distance(self, other_r, other_g, other_b):
        tmp_distance = math.sqrt( (self.r-other_r)**2 + (self.g-other_g)**2 + (self.b-other_b)**2 )
        return tmp_distance

    def print_color_code(self, color_list):
        print('# ColorCode : ' + str(colorDic[color_list[0]])+str(colorDic[color_list[1]])+str(colorDic[color_list[2]]))
    
    def quantization(self):
        
        curr_min_distance = 987654321.0
        
        tmp_R = -1
        tmp_G = -1
        tmp_B = -1
        
        for i in range(0, 27):
            #for Easy-Readable code
            R = RGBColors[i][0]
            G = RGBColors[i][1]
            B = RGBColors[i][2]
            
            #Test for correct result
            print("R:%d, G:%d, B:%d, distance: %f" % (R, G, B, self.distance(R, G, B)))
            
            if self.distance(R, G, B) <= curr_min_distance:
                curr_min_distance = self.distance(R, G, B)
                tmp_R = R
                tmp_G = G
                tmp_B = B
        
        self.print_color_code([tmp_R, tmp_G, tmp_B])


example = Color(124,46,27)
example.quantization()